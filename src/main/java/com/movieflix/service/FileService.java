package com.movieflix.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.plaf.multi.MultiPanelUI;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


@Service
public interface FileService {

    String uploadFile(String path, MultipartFile file) throws IOException;

    InputStream getResourceFile(String path, String fileName) throws FileNotFoundException;

}
