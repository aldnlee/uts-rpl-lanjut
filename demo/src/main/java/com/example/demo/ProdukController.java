package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/produk")
public class ProdukController {

    @Autowired
    private ProdukRepository repo;

    // 1. READ: Menampilkan semua produk
    @GetMapping({"/", "/list"})
    public String viewHomePage(Model model) {
        List<Produk> listProduk = repo.findAll();
        model.addAttribute("listProduk", listProduk);
        return "list_produk"; // Mengarahkan ke list_produk.jsp
    }

    // 2. CREATE (Tampilkan Form): Menampilkan form produk baru
    @GetMapping("/new")
    public String showNewProdukForm(Model model) {
        Produk produk = new Produk();
        model.addAttribute("produk", produk);
        return "form_produk"; // Mengarahkan ke form_produk.jsp
    }

    // 2/3. CREATE/UPDATE (Simpan Data): Menyimpan atau mengupdate produk
    @PostMapping("/save")
    public String saveProduk(@ModelAttribute("produk") Produk produk) {
        repo.save(produk); // Jika ada ID, dia UPDATE. Jika tidak ada ID, dia CREATE.
        return "redirect:/produk/list";
    }

    // 3. UPDATE (Tampilkan Form): Menampilkan form produk yang sudah ada untuk diedit
    @GetMapping("/edit/{id}")
    public ModelAndView showEditProdukForm(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("form_produk");
        Produk produk = repo.findById(id).orElse(new Produk()); // Ambil data
        mav.addObject("produk", produk);
        return mav;
    }

    // 4. DELETE: Menghapus produk
    @GetMapping("/delete/{id}")
    public String deleteProduk(@PathVariable(name = "id") Long id) {
        repo.deleteById(id);
        return "redirect:/produk/list";
    }
}