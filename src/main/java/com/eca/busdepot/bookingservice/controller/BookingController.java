package com.eca.busdepot.bookingservice.controller;

import com.eca.busdepot.bookingservice.model.Booking;
import com.eca.busdepot.bookingservice.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
@RequiredArgsConstructor
public class BookingController {
    
    private final BookingRepository bookingRepository;
    
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
    
    @PostMapping
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }
    
    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) {
        bookingRepository.deleteById(id);
    }
}
