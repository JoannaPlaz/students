package pl.sda.javagdy2.spring.students;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.beans.Encoder;

public class SzyfrowanieHasla {


    public static void main(String[] args) {

        String encoded = new BCryptPasswordEncoder().encode("password2");
        System.out.println(encoded);

        }
    }
