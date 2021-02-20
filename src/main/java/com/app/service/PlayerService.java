package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.domain.Player;
import com.app.repository.PlayerRepository;

@Service
public class PlayerService {
	@Autowired
	private PlayerRepository playerRepository;
	
	public List<Player> findAll() {
		return playerRepository.findAll();
	}
	
	public Player findOne(Long id) {
		Optional<Player> player = playerRepository.findById(id);
		if(player.isPresent()) {
			return player.get();
		}
		else {
			return null;
		}
	}
	
	public Player save(Player player) {
		return playerRepository.save(player);
	}
	
	public void delete(Long id) {
		playerRepository.deleteById(id);
	}
}
