package OOP2.B.FelixYunianto.AplikasiLaundry.repo;

import OOP2.B.FelixYunianto.AplikasiLaundry.entity.Laundry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaundryRepo extends JpaRepository<Laundry, String> {
}
