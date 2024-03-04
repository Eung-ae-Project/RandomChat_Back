package hello.login.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findBynickname(String nickname);
}

//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Repository;
//
//import java.util.*;
//
//@Slf4j
//@Repository
//public class UserRepository {
//
//    private static final Map<Long, User> store = new HashMap<>();
//    private static long sequence = 0L;
//
//    public User save(User user) {
//        user.setId(++sequence);
//        log.info("save: user={}", user);
//        store.put(user.getId(), user);
//        return user;
//    }
//
//    public User findById(Long id) {
//        return store.get(id);
//    }
//
//    public Optional<User> findByLoginId(String loginId) {
//        return findAll().stream()
//                .filter(m -> m.getEmail().equals(loginId))
//                .findFirst();
//    }
//
//    public List<User> findAll() {
//        return new ArrayList<>(store.values());
//    }
//
//    public void clearStore() {
//        store.clear();
//    }
//}
