-- Primera Parte
-- Responda às seguintes questões:
-- 1. Como é chamado um JOIN em um banco de dados e para que é usado?
-- Chamado de INNER JOIN, usado para obter dados de várias tabelas relacionadas.

-- 2. Explique os tipos de JOIN.
-- INTERSEÇÃO(A∩B), UNIÃO(AUB), DIFERENÇA (A-B) e DIFERENÇA (B-A)
-- INNER JOIN, FULL OUTER JOIN, LEFT JOIN, RIGHT JOIN

-- 3. Para que serve o GROUP BY?
-- Agrupa os resultados de acordo com as colunas indicadas; Gera um único 
-- registro para cada grupo de linhas q compartilham as colunas indicadas;
-- Reduz o numero de linhas na consulta; Geralmente é usado em conjunto com
-- funções de agregação, para obter dados resumidos e agrupados pelas colunas necessárias.

-- 4. Para que serve o HAVING?
-- Semelhante ao WHERE, mas ao invés de afetar linhas da tabela, afeta grupos 
-- obtidos pelo GROUP BY; 

-- 5. Escreva uma consulta genérica para cada um dos seguintes diagramas:
-- SELECT * FROM tabelaA A INNER JOIN tabela B B ON A.id = B.z;
-- SELECT * FROM tabelaA A LEFT JOIN tabela B B ON A.id = B.z;

-- Segunda Parte
-- Faça as seguintes consultas ao banco de dados movies_db.sql trabalhado na primeira
-- aula.

-- 1. Mostrar o título e o nome do gênero de todas as séries.
SELECT * FROM series;
-- 2. Mostrar o título dos episódios, o nome e sobrenome dos atores que trabalham em
-- cada um deles.
SELECT * FROM actors;
SELECT * FROM actors_movie;
SELECT movies.*, actors.first_name, actors.last_name 
FROM movies INNER JOIN actors
ON movies.id = actors.favorite_movie_id;
-- 3. Mostrar o título de todas as séries e o número total de temporadas que cada uma
-- delas possui.
SELECT * FROM series;
SELECT * FROM seasons;
SELECT series.title, COUNT(*) AS number_of_seasons 
FROM series INNER JOIN seasons 
ON seasons.serie_id = series.id 
GROUP BY series.title;
-- 4. Mostrar o nome de todos os gêneros e o número total de filmes de cada um, desde
-- que seja maior ou igual a 3.
SELECT * FROM genres;
SELECT * FROM movies;
SELECT genres.name AS genre, COUNT(*) 
AS number_of_movies FROM genres
INNER JOIN movies
ON genres.id = movies.genre_id
GROUP BY genres.name
HAVING number_of_movies >= 3;
-- 5. Mostrar apenas o nome e sobrenome dos atores que atuam em todos os filmes de
-- Star Wars e que estes não se repitam.
SELECT DISTINCT actors.first_name, actors.last_name 
FROM actors
INNER JOIN actor_movie
ON actors.id = actor_movie.actor_id
INNER JOIN movies
ON actor_movie.movie_id = movies.id
WHERE movies.title LIKE 'La Guerra de las galaxias%';