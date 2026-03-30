package com.eca.busdepot.bookingservice.controller;

import com.eca.busdepot.bookingservice.model.Booking;
import com.eca.busdepot.bookingservice.repository.BookingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    // final field must be initialized via constructor
    private final BookingRepository bookingRepository;

    // Constructor injection - Spring will automatically inject BookingRepository
    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    // GET /bookings - fetch all bookings
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // POST /bookings - add a new booking
    @PostMapping
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }

    // DELETE /bookings/{id} - delete booking by ID
    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) {
        bookingRepository.deleteById(id);
    }
}