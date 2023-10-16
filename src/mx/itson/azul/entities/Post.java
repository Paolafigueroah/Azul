/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.azul.entities;

import java.util.ArrayList;
import java.util.List;
import mx.itson.azul.enums.Categoria;

/**
 *
 * @author propietario
 */
public class Post {

    private String autor;
    private String contenido;
    private Categoria categoria;
    private int likes;
    private int dislikes;
    private String imagenUrl;
    private List<Comment> comment;
    
    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the likes
     */
    public int getLikes() {
        return likes;
    }

    /**
     * @param likes the likes to set
     */
    public void setLikes(int likes) {
        this.likes = likes;
    }

    /**
     * @return the dislikes
     */
    public int getDislikes() {
        return dislikes;
    }

    /**
     * @param dislikes the dislikes to set
     */
    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    /**
     * @return the imagenUrl
     */
    public String getImagenUrl() {
        return imagenUrl;
    }

    /**
     * @param imagenUrl the imagenUrl to set
     */
    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
  
 public List<Comment> getComment() {
        return comment;
    }
    
    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
    
    public Post() {
        comment = new ArrayList<>();
    }
}