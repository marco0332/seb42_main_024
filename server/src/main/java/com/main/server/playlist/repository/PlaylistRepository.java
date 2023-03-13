package com.main.server.playlist.repository;

import com.main.server.playlist.entity.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface PlaylistRepository extends JpaRepository<Playlist,Long> {


    Optional<Playlist> findPlaylistId(Long playlistId);
}
