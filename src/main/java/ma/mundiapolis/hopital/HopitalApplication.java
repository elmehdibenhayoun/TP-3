package ma.mundiapolis.hopital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.mundiapolis.hopital.entities.Patient;
import ma.mundiapolis.hopital.repository.PatientRepository;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(HopitalApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
       patientRepository.save(new Patient(null,"Mohamed",new Date(),false,5000));
       patientRepository.save(new Patient(null,"Hanane",new Date(),false,432));
       patientRepository.save(new Patient(null,"Imane",new Date(),true,340));

    }
}
