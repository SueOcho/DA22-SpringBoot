package pe.isil.loader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pe.isil.model.Company;
import pe.isil.repository.CompanyRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyLoader implements CommandLineRunner {

    private final CompanyRepository companyRepository;

    public CompanyLoader(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Company> companies = new ArrayList<>();
        companies.add(new Company(null,"0000000001", "ISIL SA", null));
        companies.add(new Company(null,"0000000002", "Bodega Don Pepe SA", null));
        companies.add(new Company(null,"0000000003", "Ferreteria Bryam SA", null));

        companyRepository.saveAll(companies);
    }
}
