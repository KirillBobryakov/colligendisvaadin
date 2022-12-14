//package com.bkv.colligendis.data.generator;
//
//import com.bkv.colligendis.data.Role;
//import com.bkv.colligendis.data.entity.SamplePerson;
//import com.bkv.colligendis.data.entity.User;
//import com.bkv.colligendis.data.service.SamplePersonRepository;
//import com.bkv.colligendis.data.service.UserRepository;
//import com.bkv.colligendis.data.service.UserService;
//import com.vaadin.exampledata.DataType;
//import com.vaadin.exampledata.ExampleDataGenerator;
//import com.vaadin.flow.spring.annotation.SpringComponent;
//import java.time.LocalDateTime;
//import java.util.Collections;
//import java.util.Set;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@SpringComponent
//public class DataGenerator {
//
//    @Bean
//    public CommandLineRunner loadData(PasswordEncoder passwordEncoder, SamplePersonRepository samplePersonRepository,
//            UserService userService) {
//        return args -> {
//            Logger logger = LoggerFactory.getLogger(getClass());
//            if (samplePersonRepository.count().block() != 0L) {
//                logger.info("Using existing database");
//                return;
//            }
//            int seed = 123;
//
//            logger.info("Generating demo data");
//
////            logger.info("... generating 100 Sample Person entities...");
////            ExampleDataGenerator<SamplePerson> samplePersonRepositoryGenerator = new ExampleDataGenerator<>(
////                    SamplePerson.class, LocalDateTime.of(2022, 7, 22, 0, 0, 0));
////            samplePersonRepositoryGenerator.setData(SamplePerson::setFirstName, DataType.FIRST_NAME);
////            samplePersonRepositoryGenerator.setData(SamplePerson::setLastName, DataType.LAST_NAME);
////            samplePersonRepositoryGenerator.setData(SamplePerson::setEmail, DataType.EMAIL);
////            samplePersonRepositoryGenerator.setData(SamplePerson::setPhone, DataType.PHONE_NUMBER);
////            samplePersonRepositoryGenerator.setData(SamplePerson::setDateOfBirth, DataType.DATE_OF_BIRTH);
////            samplePersonRepositoryGenerator.setData(SamplePerson::setOccupation, DataType.OCCUPATION);
////            samplePersonRepositoryGenerator.setData(SamplePerson::setImportant, DataType.BOOLEAN_10_90);
////            samplePersonRepository.saveAll(samplePersonRepositoryGenerator.create(100, seed));
//
//            logger.info("... generating 2 User entities...");
//            User user = new User();
//            user.setName("John Normal");
//            user.setLoginName("user");
//            user.setPasswordSHA(passwordEncoder.encode("user"));
////            user.setProfilePictureUrl(
////                    "https://images.unsplash.com/photo-1535713875002-d1d0cf377fde?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=128&h=128&q=80");
//            user.setRoles(Collections.singleton(Role.USER));
//            userService.save(user);
//            User admin = new User();
//            admin.setName("Emma Powerful");
//            admin.setLoginName("admin");
//            admin.setPasswordSHA(passwordEncoder.encode("admin"));
////            admin.setProfilePictureUrl(
////                    "https://images.unsplash.com/photo-1607746882042-944635dfe10e?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=128&h=128&q=80");
//            admin.setRoles(Set.of(Role.USER, Role.ADMIN));
//            userService.save(admin);
//
//            logger.info("Generated demo data");
//        };
//    }
//
//}