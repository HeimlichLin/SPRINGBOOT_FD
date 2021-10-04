package idv.heimlich.springboot.adapter.repository.inmemory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import idv.heimlich.springboot.entity.IEntity;
import idv.heimlich.springboot.entity.IKey;
import idv.heimlich.springboot.entity.commons.exception.PclmsBusinessExecpetion;

/**
 * 通用暫存記憶體
 */
public class CommonRepositoryInMem<Entity extends IEntity> {

	private final Map<String, Entity> entityMap = new HashMap<>();

	public List<Entity> findAll() {
		return this.entityMap.values().stream().collect(Collectors.toList());
	}

	public Entity findById(IKey key) {
		return this.entityMap.getOrDefault(key.toKey(), null);
	}

	public Entity saveOrUpdate(Entity entity) {
		this.entityMap.put(entity.getKey().toKey(), entity);
		return entity;
	}

	public Entity update(Entity entity) {
		if (this.entityMap.containsKey(entity.getKey().toKey())) {
			this.entityMap.put(entity.getKey().toKey(), entity);
			return entity;
		}
		return null;
	}

	public int deleteById(IKey entity) {
		if (this.entityMap.containsKey(entity.toKey())) {
			this.entityMap.remove(entity.toKey());
			return 1;
		}
		return 0;
	}

	public Entity insert(Entity entity) {
		if (this.entityMap.containsKey(entity.getKey().toKey())) {
			throw new PclmsBusinessExecpetion("新增失敗:entity:" + entity);
		} else {
			this.entityMap.put(entity.getKey().toKey(), entity);
			return entity;
		}
	}

}
