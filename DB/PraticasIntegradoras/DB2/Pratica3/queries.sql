-- 1. Listar os dados dos autores.
SELECT * FROM autor;
-- 2. Listar nome e idade dos alunos
SELECT * FROM aluno;
SELECT nome, idade FROM aluno;
-- 3. Quais alunos pertencem à carreira de informática?
SELECT nome, carreira FROM aluno
WHERE carreira = "informatica";
-- 4. Quais autores são de nacionalidade francesa ou italiana?
SELECT nome, nacionalidade FROM autor WHERE nacionalidade = "francesa" OR nacionalidade = "italiana";
-- 5. Que livros não são da área da internet?
SELECT titulo, area FROM livro
WHERE area = "internet";
-- 6. Listar os livros da editora Salamandra.
SELECT titulo, editora FROM livro
WHERE editora = "Salamandra";
-- 7. Listar os dados dos alunos cuja idade é maior que a média.
SELECT nome, idade FROM aluno
WHERE idade > (SELECT AVG(idade) FROM aluno GROUP BY idade LIMIT 1);
-- 8. Listar os nomes dos alunos cujo sobrenome começa com a letra G.
SELECT nome, sobrenome FROM aluno
WHERE sobrenome LIKE "G%";
-- 9. Listar os autores do livro "O Universo: Guia de Viagem". (Apenas nomes
-- devem ser listados.)
SELECT autor.nome FROM autor
INNER JOIN livro_autor ON id_autor = livro_autor.id_autor
INNER JOIN livro ON livro_autor.id_livro = id_livro
WHERE livro.titulo = 'O Universo: Guia de Viagem';
-- 10. Listar autores que tenham nacionalidade italiana ou argentina.
SELECT autor.nome FROM autor
WHERE nacionalidade = "italiana" OR nacionalidade = "argentina";
-- 11. Que livros foram emprestados ao leitor “Filippo Galli”?
SELECT livro.titulo FROM livro
INNER JOIN emprestimo ON livro.id = emprestimo.id_livro
INNER JOIN aluno ON emprestimo.id_aluno= aluno.id
WHERE alunoid_aluno.nome = 'Filippo' AND aluno.sobrenome = 'Galli';
-- 12. Listar o nome do aluno mais novo.
SELECT nome FROM aluno ORDER BY idade LIMIT 1;
-- 13. Listar os nomes dos alunos a quem os livros de Banco de Dados foram
-- emprestados.
SELECT nome FROM aluno 
INNER JOIN emprestimo ON aluno.id = emprestimo.id_aluno
INNER JOIN livro ON emprestimo.id_livro = livro.id
WHERE area = 'Banco de Dados';
-- 14. Listar os livros que pertencem ao autor J.K. Rowling.
SELECT titulo FROM livro
INNER JOIN livro_autor ON livro.id = livro_autor.id_livro
INNER JOIN autor ON livro_autor.id = autor.id
WHERE autor.nome = 'J.K. Rowling';
-- 15. Listar os títulos dos livros que deveriam ser devolvidos até 16/07/2021.
SELECT titulo FROM livro
INNER JOIN emprestimo ON livro.id = emprestimo.id_livro
WHERE emprestimo.data_devolucao < '2021-07-16';