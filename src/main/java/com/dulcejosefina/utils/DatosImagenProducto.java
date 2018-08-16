/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dulcejosefina.utils;

/**
 *
 * @author Edgardo
 */
public class DatosImagenProducto {
    private long id;
    private long idProducto;
    private byte[] longitudImagen;
    private String nameImagen;
    private String magnitud;
    private String path;    
    private String extension;
    

    public long getId() {
        return id;
    }

    public String getPath() {
        return path;
    }

    

    public String getExtension() {
        return extension;
    }

    public String getMagnitud() {
        return magnitud;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public byte[] getLongitudImagen() {
        return longitudImagen;
    }

    public String getNameImagen() {
        return nameImagen;
    }
    
    
}
