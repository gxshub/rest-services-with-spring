package csci318.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    private final LibraryRepository libraryRepository;

    public LibraryController(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @GetMapping("/libraries")
    List<Library> all() {
        return libraryRepository.findAll();
    }

    @GetMapping("/libraries/{id}")
    Library findLibraryById(@PathVariable Long id) {
        return libraryRepository.findById(id)
                .orElseThrow(RuntimeException::new);
    }

    @PostMapping("/libraries")
    Library createLibrary(@RequestBody Library newLibrary) {
        return libraryRepository.save(newLibrary);
    }

    @PutMapping("/libraries/{id}")
    Library updateLibraryName(@PathVariable Long id, @RequestBody Library library) {
        Library library1 = libraryRepository.findById(id)
                .orElseThrow(RuntimeException::new);
        library1.setName(library.getName());
        return libraryRepository.save(library1);
    }
}
