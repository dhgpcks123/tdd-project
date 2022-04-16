package tpp.tddproject.rin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tpp.tddproject.domain.entity.item.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    Item findByItemName(String itemName);
}
