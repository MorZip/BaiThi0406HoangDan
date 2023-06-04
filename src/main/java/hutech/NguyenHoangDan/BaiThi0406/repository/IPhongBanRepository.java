package hutech.NguyenHoangDan.BaiThi0406.repository;

import hutech.NguyenHoangDan.BaiThi0406.model.PhongBan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongBanRepository extends JpaRepository<PhongBan, String> {
}

