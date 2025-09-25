USE streaming;

-- Usuários
INSERT INTO usuario (nome, email, senha, data_cadastro) VALUES
('João Silva', 'joao@email.com', '123456', NOW()),
('Maria Oliveira', 'maria@email.com', 'abcdef', NOW()),
('Carlos Souza', 'carlos@email.com', 'senha123', NOW());

-- Perfis (cada usuário pode ter vários perfis, como na Netflix)
INSERT INTO perfil (nome_perfil, id_usuario) VALUES
('João - Principal', 1),
('Maria - Kids', 2),
('Maria - Principal', 2),
('Carlos - Principal', 3);

-- Categorias
INSERT INTO categoria (nome) VALUES
('Ação'),
('Comédia'),
('Drama'),
('Documentário'),
('Animação');

-- Vídeos
INSERT INTO video (titulo, descricao, duracao, id_categoria) VALUES
('Missão Impossível', 'Filme de ação com Tom Cruise', 120, 1),
('Velozes e Furiosos', 'Corridas e muita adrenalina', 140, 1),
('Todo Mundo em Pânico', 'Paródia de filmes de terror', 90, 2),
('A Procura da Felicidade', 'Drama com Will Smith', 117, 3),
('Planeta Terra', 'Documentário sobre a vida selvagem', 60, 4),
('Toy Story', 'Animação clássica da Pixar', 81, 5);

-- Visualizações (perfil assistindo vídeos)
INSERT INTO visualizacao (data_hora, progresso, id_perfil, id_video) VALUES
(NOW(), 45, 1, 1), -- João assistiu 45min de Missão Impossível
(NOW(), 90, 2, 6), -- Maria Kids assistiu 90min de Toy Story
(NOW(), 117, 3, 4), -- Maria Principal terminou A Procura da Felicidade
(NOW(), 50, 4, 2); -- Carlos assistiu metade de Velozes e Furiosos

-- Avaliações
INSERT INTO avaliacao (nota, comentario, id_perfil, id_video) VALUES
(5, 'Muito bom, cheio de ação!', 1, 1),
(4, 'Filme divertido para toda a família.', 2, 6),
(5, 'História emocionante, excelente atuação.', 3, 4),
(3, 'Legal, mas achei longo demais.', 4, 2);

-- Novos vídeos
INSERT INTO video (titulo, descricao, duracao, id_categoria) VALUES
('Os Vingadores', 'Super-heróis se unem para salvar o mundo', 143, 1),
('Deadpool', 'Comédia de ação e humor ácido', 108, 2),
('O Rei Leão', 'Animação clássica da Disney', 88, 5),
('Interestelar', 'Viagem espacial e drama familiar', 169, 3),
('Stranger Things: The Movie', 'Aventura e mistério nos anos 80', 115, 4),
('A Fantástica Fábrica de Chocolate', 'Comédia e fantasia para todas as idades', 100, 2),
('Homem-Aranha: Sem Volta Para Casa', 'Ação e aventura com super-heróis', 148, 1),
('Soul', 'Animação emocionante sobre música e propósito', 100, 5);

INSERT INTO visualizacao (data_hora, progresso, id_perfil, id_video) VALUES
-- Vídeo 1 - Missão Impossível (já tinha perfil 1)
(NOW(), 100, 3, 1), -- Maria Principal assistiu 100min
(NOW(), 120, 4, 1), -- Carlos terminou

-- Vídeo 2 - Velozes e Furiosos (já tinha perfil 4)
(NOW(), 60, 1, 2), -- João viu 1h
(NOW(), 140, 2, 2), -- Maria Kids terminou

-- Vídeo 3 - Todo Mundo em Pânico (novo nas visualizações)
(NOW(), 30, 2, 3), -- Maria Kids viu só o começo
(NOW(), 90, 3, 3), -- Maria Principal terminou

-- Vídeo 4 - À Procura da Felicidade (já tinha perfil 3)
(NOW(), 60, 1, 4), -- João viu metade
(NOW(), 117, 4, 4), -- Carlos terminou

-- Vídeo 5 - Planeta Terra (novo nas visualizações)
(NOW(), 20, 1, 5), -- João começou
(NOW(), 60, 2, 5), -- Maria Kids terminou

-- Vídeo 6 - Toy Story (já tinha perfil 2)
(NOW(), 40, 3, 6), -- Maria Principal começou
(NOW(), 81, 4, 6), -- Carlos terminou

-- Vídeo 7 - Interestelar (novo)
(NOW(), 150, 1, 7), -- João quase terminou
(NOW(), 169, 3, 7), -- Maria Principal terminou

-- Vídeo 8 - O Rei Leão (novo)
(NOW(), 30, 2, 8), -- Maria Kids começou
(NOW(), 88, 4, 8), -- Carlos terminou

-- Vídeo 9 - Matrix (novo)
(NOW(), 50, 1, 9), -- João viu parte
(NOW(), 136, 3, 9), -- Maria Principal terminou

-- Vídeo 10 - A Origem (novo)
(NOW(), 100, 2, 10), -- Maria Kids assistiu parte
(NOW(), 148, 4, 10); -- Carlos terminou
