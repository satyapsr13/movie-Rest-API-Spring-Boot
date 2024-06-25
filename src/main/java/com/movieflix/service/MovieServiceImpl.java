package com.movieflix.service;

import com.movieflix.dto.MovieDto;
import com.movieflix.repositories.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    private  final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public MovieDto addMovie(MovieDto movieDto, MultipartFile file) {
    // 1. upload the file

    // 2. set value of fiel post as filename

    // 3. map dto to movie object

    // 4. save the movie to movie object -> save movie object

    // 5. generate posterUrl

    // 6. map Movie object to DTO object and return it



        return null;
    }

    @Override
    public MovieDto getMovie(Integer movieId) {
        return null;
    }

    @Override
    public List<MovieDto> getALlMovies() {
        return null;
    }
}
