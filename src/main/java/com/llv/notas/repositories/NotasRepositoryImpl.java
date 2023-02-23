// package com.llv.notas.repositories;

// import java.util.Date;
// import java.util.List;
// import java.util.Optional;
// import java.util.function.Function;

// import org.springframework.data.domain.Example;
// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.Pageable;
// import org.springframework.data.domain.Sort;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

// import com.llv.notas.models.Nota;


// public class NotasRepositoryImpl implements NotasRepository{

//     @Override
//     public List<Nota> findAll() {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public List<Nota> findAll(Sort sort) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public List<Nota> findAllById(Iterable<Integer> ids) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public <S extends Nota> List<S> saveAll(Iterable<S> entities) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public void flush() {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public <S extends Nota> S saveAndFlush(S entity) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public <S extends Nota> List<S> saveAllAndFlush(Iterable<S> entities) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public void deleteAllInBatch(Iterable<Nota> entities) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void deleteAllByIdInBatch(Iterable<Integer> ids) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void deleteAllInBatch() {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public Nota getOne(Integer id) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Nota getById(Integer id) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Nota getReferenceById(Integer id) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public <S extends Nota> List<S> findAll(Example<S> example) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public <S extends Nota> List<S> findAll(Example<S> example, Sort sort) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Page<Nota> findAll(Pageable pageable) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public <S extends Nota> S save(S entity) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public Optional<Nota> findById(Integer id) {
//         // TODO Auto-generated method stub
//         return Optional.empty();
//     }

//     @Override
//     public boolean existsById(Integer id) {
//         // TODO Auto-generated method stub
//         return false;
//     }

//     @Override
//     public long count() {
//         // TODO Auto-generated method stub
//         return 0;
//     }

//     @Override
//     public void deleteById(Integer id) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void delete(Nota entity) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void deleteAllById(Iterable<? extends Integer> ids) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void deleteAll(Iterable<? extends Nota> entities) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void deleteAll() {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public <S extends Nota> Optional<S> findOne(Example<S> example) {
//         // TODO Auto-generated method stub
//         return Optional.empty();
//     }

//     @Override
//     public <S extends Nota> Page<S> findAll(Example<S> example, Pageable pageable) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public <S extends Nota> long count(Example<S> example) {
//         // TODO Auto-generated method stub
//         return 0;
//     }

//     @Override
//     public <S extends Nota> boolean exists(Example<S> example) {
//         // TODO Auto-generated method stub
//         return false;
//     }

//     @Override
//     public <S extends Nota, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public List<Nota> findByTituloContainingIgnoreCaseAndFechaGreaterThanEqual(String titulo, Date fecha) {
//         // TODO Auto-generated method stub
//         return null;
//     }

    
// }
