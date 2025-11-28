case class Goleador(
                     posicion: Int,
                     nombre: String,
                     equipo: String,
                     partidos: Int,
                     goles: Int
                   )


val goleadores: List[Goleador] = List(
  Goleador(1,  "Jorge Valencia",   "Manta F.C.",                        34, 19),
  Goleador(2,  "Rafael Monti",     "Vinotinto",                         35, 18),
  Goleador(3,  "Claudio Spinelli", "Independiente del Valle",           31, 18),
  Goleador(4,  "Byron Palacios",   "Universidad Católica (Quito)",      36, 17),
  Goleador(5,  "Djorkaeff Reasco", "El Nacional",                       31, 17),
  Goleador(6,  "Janner Corozo",    "Barcelona SC",                      35, 15),
  Goleador(7,  "Eber Caicedo",     "Libertad (Ecuador)",                33, 14),
  Goleador(8,  "Federico Paz",     "Macará",                            30, 12),
  Goleador(9,  "Bruno Miranda",    "Aucas",                             31, 11),
  Goleador(10, "Brian Montenegro", "Aucas",                             30, 11),
  Goleador(11, "Miguel Parrales",  "Barcelona SC",                      30, 11),
  Goleador(12, "Cristian Tobar",   "Deportivo Cuenca",                  36, 10),
  Goleador(13, "Michael Estrada",  "Liga de Quito",                     30, 10),
  Goleador(14, "Michael Hoyos",    "Independiente del Valle",           29, 10),
  Goleador(15, "José Fajardo",     "Universidad Católica (Quito)",      24, 10),
  Goleador(16, "Walter Herrera",   "Orense",                            34, 9),
  Goleador(17, "Octavio Rivero",   "Barcelona SC",                      24, 9),
  Goleador(18, "Mauricio Alonso",  "Universidad Católica (Quito)",      34, 8),
  Goleador(19, "Christian Alemán", "Manta F.C.",                        31, 8),
  Goleador(20, "Erick Mendoza",    "Delfín",                            23, 8),
  Goleador(21, "Michael Carcelén", "Aucas",                             23, 8),
  Goleador(22, "Nestor Caicedo",   "Libertad (Ecuador)",                35, 7),
  Goleador(23, "Cristian Penilla","Mushuc Runa",                       33, 7),
  Goleador(24, "Azarias Londoño", "Universidad Católica (Quito)",       31, 7),
  Goleador(25, "Lisandro Alzugaray","Liga de Quito",                    29, 7),
  Goleador(26, "Luis Cano",        "Aucas",                             25, 7),
  Goleador(27, "Ismael Díaz",      "Universidad Católica (Quito)",      16, 7),
  Goleador(28, "Bryan Ramírez",    "Liga de Quito",                     32, 6),
  Goleador(29, "Gabriel Villamil", "Liga de Quito",                     30, 6),
  Goleador(30, "Jorge Ordóñez",    "Deportivo Cuenca",                  27, 6),
  Goleador(31, "Jeison Medina",    "Liga de Quito",                     27, 6),
  Goleador(32, "Pablo Gonzalez",   "Macará",                            20, 6),
  Goleador(33, "Gabriel Cortez",   "Barcelona SC",                      20, 6),
  Goleador(34, "Fernando Cornejo", "Liga de Quito",                     32, 5),
  Goleador(35, "Danny Luna",       "Vinotinto",                         31, 5),
  Goleador(36, "Jose Cevallos",    "Emelec",                            31, 5),
  Goleador(37, "Lucas Mancinelli", "Deportivo Cuenca",                  28, 5),
  Goleador(38, "Alexis Rodríguez", "Deportivo Cuenca",                  28, 5),
  Goleador(39, "Ángel Mena",       "Orense",                            26, 5),
  Goleador(40, "Ángel Ledesma",    "Macará",                            26, 5),
  Goleador(41, "Jaime Ayoví",      "Emelec",                            25, 5),
  Goleador(42, "Jostin Alman",     "Manta F.C.",                        22, 5),
  Goleador(43, "Jean Carlos Blanco","Técnico Universitario",            20, 5),
  Goleador(44, "Arón Rodríguez",   "Independiente del Valle",           20, 5),
  Goleador(45, "Facundo Castelli","Emelec",                            19, 5),
  Goleador(46, "Jonathan Dos Santos","Mushuc Runa",                    16, 5),
  Goleador(47, "Jose Marrufo",     "Macará",                            35, 4),
  Goleador(48, "Carlos Arboleda",  "Libertad (Ecuador)",                34, 4),
  Goleador(49, "Wilter Ayoví",     "Libertad (Ecuador)",                34, 4),
  Goleador(50, "Eddy Mejía",       "Universidad Católica (Quito)",      34, 4)
)

/// Cuantos goles en total han marcado los goledores
val total: Int = goleadores.map(_.goles).sum
// Cual es el promedio de goles marcados
val promedio :Double  = goleadores.map(_.goles).sum / goleadores.size.toDouble
// cuantos goleadores tiene libertad
val libertad: Int = goleadores.count(_.equipo == "Libertad")
val goleadoresLibertad :Int = goleadores.filter(_.equipo.toLowerCase().contains("Libertad")).size
//Del equipo aucas cual es el maximo goleador
 goleadores.filter(_.equipo.toLowerCase.contains("aucas")).maxBy(_.goles)
// Cual es el promedio de goles de los jugadores de barcelona
val promedioBarcelona: Double =
  goleadores.filter(_.equipo.toLowerCase.contains("barcelona"))
  .map(_.goles)
  .sum / goleadores.count(_.equipo.toLowerCase.contains("barcelona"))
  // Cual es el equipo que tiene  mas goleadores en la lista??
 


