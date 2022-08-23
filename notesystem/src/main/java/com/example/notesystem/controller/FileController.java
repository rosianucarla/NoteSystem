package com.example.notesystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

@RestController
public class FileController {


    @RequestMapping(value = "/notes", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<String> writeFile() throws Exception {

        String line = "";
        try {
            File file = new File("notes.txt");

            //
            //If the file does not exist, it generates
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            // Write and close file
            bw.write(line);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<String>(line, HttpStatus.CREATED);
    }


    @RequestMapping(value = "/notes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> readArchive() throws Exception {

        String line = null;
        try {
            FileReader ler = new FileReader("notes.txt");
            BufferedReader reader = new BufferedReader(ler);
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<String>(line, HttpStatus.OK);
    }
}
