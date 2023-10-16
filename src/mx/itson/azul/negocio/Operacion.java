/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.azul.negocio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.itson.azul.entities.Comment;
import mx.itson.azul.entities.Post;
import mx.itson.azul.enums.Categoria;

/**
 *
 * @author Paola Figueroa
 */
public class Operacion {
 
    private List<Post> posts;

    public Operacion() {
        posts = new ArrayList<>();
    }

    public void crearPost(String autor, String contenido, Categoria categoria, String imagenUrl) {
        Post post = new Post();
        post.setAutor(autor);
        post.setContenido(contenido);
        post.setCategoria(categoria);
        post.setImagenUrl(imagenUrl);
        posts.add(post);
    }

    public void comentarPost(int postId, String autor, String comentario, String usuario) {
        Post post = posts.get(postId);
        Comment nuevoComentario = new Comment();
        nuevoComentario.setAutor(autor);
        nuevoComentario.setContenido(comentario);
        nuevoComentario.setUsuario(usuario);
        post.getComment();
    }

    public void darLike(int postId) {
        Post post = posts.get(postId);
        post.setLikes(post.getLikes() + 1);
    }

    public void darDislike(int postId) {
        Post post = posts.get(postId);
        post.setDislikes(post.getDislikes() + 1);
    }

    public List<Post> getPosts() {
        return posts;
    }
}       