package com.example.tourism;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingRepository repository;

    @PostMapping
    public Booking saveBooking(@RequestBody Booking booking) {
        return repository.save(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return repository.findAll();
    }
}