//package mk.finki.ukim.mk.lab.bootstrap;
//
//import jakarta.annotation.PostConstruct;
//import mk.finki.ukim.mk.lab.model.Album;
//import mk.finki.ukim.mk.lab.model.Artist;
//import mk.finki.ukim.mk.lab.model.Category;
//import mk.finki.ukim.mk.lab.model.Song;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Component
//public class DataHolder {
//    public static List<Song> songs = null;
//    public static List<Artist> artists = null;
//
//    public static List<Artist> artistToSong = null;
////    public static List<Category> categories = null;
//
//    public static List<Album> albums = null;
//
//    public static List<Album> reviews = null;
//
//    @PostConstruct
//    public void init() {
////        categories = new ArrayList<>();
////        categories.add(new Category("Category1"));
////        categories.add(new Category("Category2"));
////        categories.add(new Category("Category3"));
////        categories.add(new Category("Category4"));
//
//        albums = new ArrayList<>();
//        albums.add(new Album(1L, "Thriller", "Pop", "1982"));
//        albums.add(new Album(2L, "The Dark Side of the Moon", "Progressive Rock", "1973"));
//        albums.add(new Album(3L, "Back in Black", "Hard Rock", "1980"));
//        albums.add(new Album(4L, "Rumours", "Soft Rock", "1977"));
//        albums.add(new Album(5L, "Abbey Road", "Rock", "1969"));
//
//        artists = new ArrayList<>();
//        artists.add(new Artist(1L, "Michael", "Smith", "A renowned country singer known for heartfelt lyrics and soulful melodies.",new ArrayList<>()));
//        artists.add(new Artist(2L, "Jessica", "Johnson", "A pop artist with chart-topping hits and a vibrant stage presence.",new ArrayList<>()));
//        artists.add(new Artist(3L, "David", "Brown", "An acclaimed rock guitarist known for his electrifying performances.",new ArrayList<>()));
//        artists.add(new Artist(4L, "Emily", "Davis", "An indie folk singer-songwriter with a knack for storytelling.",new ArrayList<>()));
//        artists.add(new Artist(5L, "Joshua", "Wilson", "A talented hip-hop artist recognized for his insightful lyrics and beats.",new ArrayList<>()));
//
//        if (artists.size() < 5) {
//            throw new IllegalStateException("Artists list does not contain enough elements.");
//        }
//        artistToSong = new ArrayList<>();
//        songs = new ArrayList<>();
//        reviews = new ArrayList<>();
//        songs.add(new Song("1", "Song One", "Pop", categories.get(0),2020,  new ArrayList<>(List.of(artists.get(1))),albums.get(0),new ArrayList<>()));
//        songs.add(new Song("2", "Song Two", "Rock", categories.get(2),2019,  new ArrayList<>(List.of(artists.get(3))),albums.get(1),new ArrayList<>()));
//        songs.add(new Song("3", "Song Three", "Jazz",categories.get(1), 2021, new ArrayList<>(List.of(artists.get(1), artists.get(4))),albums.get(2),new ArrayList<>()));
//        songs.add(new Song("4", "Song Four", "Hip Hop",categories.get(2) ,2018,  new ArrayList<>(List.of(artists.get(1),artists.get(2))),albums.get(3),new ArrayList<>()));
//        songs.add(new Song("5", "Song Five", "Classical",categories.get(3) ,2017,  new ArrayList<>(List.of(artists.get(4))),albums.get(4),new ArrayList<>()));
//
//    }
//}
