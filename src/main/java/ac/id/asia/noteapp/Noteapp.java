/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ac.id.asia.noteapp;

/**
 *
 * @author fiyuu
 */
public class Noteapp {

    public static void main(String[] args) {
        System.out.println("By: Fiantyo Galih P. NIM: 23201120");
        NoteAppMenu app = new NoteAppMenu("db_data/notes");
        app.start();
    }
}
