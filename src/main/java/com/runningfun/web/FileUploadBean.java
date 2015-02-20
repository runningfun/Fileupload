package com.runningfun.web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

@Named("fileUploadBean")
@RequestScoped
public class FileUploadBean {

    private Part uploadedFile;
    private String text;

    public FileUploadBean() {
    }

    public void upload() {

        if (null != uploadedFile) {
            try {
                InputStream is = uploadedFile.getInputStream();
                text = new Scanner(is).useDelimiter("\\A").next();
            } catch (IOException ex) {
            }
        }
    }

    public Part getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(Part uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}