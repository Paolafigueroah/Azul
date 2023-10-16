/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.ui;

import java.util.Scanner;
import mx.itson.azul.entities.Comment;
import mx.itson.azul.entities.Post;
import mx.itson.azul.enums.Categoria;
import mx.itson.azul.negocio.Operacion;

/**
 *
 * @author propietario
 */
public class Main {

    public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
        Operacion operacion = new Operacion();

        operacion.crearPost("Usuario1", "Contenido del post", Categoria.CIENCIA, "http://ejemplo.com/imagen");
        operacion.comentarPost(0, "Usuario2", "Comentario de Usuario2", "Usuario2");

        System.out.println("Posts en el foro:");
        for (int i = 0; i < operacion.getPosts().size(); i++) {
            Post post = operacion.getPosts().get(i);
            System.out.println("Post " + i + ": " + post.getContenido());
            System.out.println("Autor: " + post.getAutor());
            System.out.println("Categoría: " + post.getCategoria());
            System.out.println("Imagen: " + post.getImagenUrl());
            System.out.println("Likes: " + post.getLikes());
            System.out.println("Dislikes: " + post.getDislikes());

            System.out.println("Comentarios:");
            for (Comment comentario : post.getComment()) {
                System.out.println(" - " + comentario.getContenido() + " (Usuario: " + comentario.getUsuario() + ")");
            }

            System.out.println();
        }
    }
    
}