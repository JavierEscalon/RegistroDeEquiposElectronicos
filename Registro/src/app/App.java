package app;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        // Inicialización de listas para almacenar los diferentes tipos de dispositivos
        ArrayList<Desktop> desktops = new ArrayList<>();
        ArrayList<Laptop> laptops = new ArrayList<>();
        ArrayList<Tablet> tablets = new ArrayList<>();


        // Variables para control de flujo y entrada de usuario
        String input;
        boolean validInput;
        int opcion;


        boolean continuar = true;

        // Bucle principal del programa
        while (continuar) {

            // Definición de opciones para los menús
            String[] primerasOpciones = new String[]{"Salir", "Ver Equipo", "Registrar Equipo"};
            String[] segundasOpciones = new String[]{"Tablets", "Laptops", "Desktops"};

            // Mostrar menú principal y obtener la opción del usuario
            opcion = JOptionPane.showOptionDialog(null, "1. Registrar Equipo\n" + "     -Desktops\n" + "     -Laptops\n" + "     -Tablets\n" + "2. Ver Equipo\n" + "     -Desktops\n" + "     -Laptops\n" + "     -Tablets\n" + "3. Salir", "¿Que quisiera hacer?", 0, JOptionPane.QUESTION_MESSAGE, null, primerasOpciones, "");
            System.out.println(opcion);

            // Salir del programa si el usuario selecciona "Salir"
            if (opcion <= 0) {
                continuar = false;
            }
            // Procesar la opción seleccionada por el usuario
            if (opcion == 2) {
                //REGISTRAR EQUIPO----------------------------------------------
                opcion = JOptionPane.showOptionDialog(null, "¿Que tipo de equipo quiere registrar?", "Registrar", 0, JOptionPane.QUESTION_MESSAGE, null, segundasOpciones, "");

                if (opcion == 0) {
                    //REGISTRAR TABLET
                    Tablet tablet = new Tablet();
                    // Solicitar y validar la entrada de datos para cada atributo de la tablet
                    // Este patrón se repite para cada atributo
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Fabricante", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            tablet.fabricante = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Modelo", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            tablet.modelo = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Microprocesador", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            tablet.microprocesador = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Tamaño Diagonal de Pantalla", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            tablet.diagonalPantalla = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "¿Capacitiva/Resistiva?", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            tablet.capacitivaResistiva = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Tamaño Memoria NAND", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            tablet.memoriaNand = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Sistema Operativo", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            tablet.sistemaOperativo = input;
                            validInput = true;
                        }
                    }
                    // Añade la tablet a la lista de tablets
                    tablets.add(tablet);

                } else if (opcion == 1) {
                    //REGISTRAR LAPTOP
                    Laptop laptop = new Laptop();
                    // Solicitar y validar la entrada de datos para cada atributo de la laptop
                    // Este patrón se repite para cada atributo
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Fabricante", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            laptop.fabricante = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Modelo", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            laptop.modelo = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Microprocesador", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            laptop.microprocesador = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Memoria", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            laptop.memoria = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Tamaño de la Pantalla", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            laptop.pantalla = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Capacidad del Disco Duro", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            laptop.discoDuro = input;
                            validInput = true;
                        }
                    }
                    // Añade la laptop a la lista de laptops
                    laptops.add(laptop);

                } else if (opcion == 2) {
                    //REGISTRA DESKTOP
                    Desktop desktop = new Desktop();
                    // Solicitar y validar la entrada de datos para cada atributo de la desktop
                    // Este patrón se repite para cada atributo
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Fabricante", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            desktop.fabricante = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Modelo", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            desktop.modelo = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Microprocesador", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            desktop.microprocesador = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Memoria", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            desktop.memoria = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Tarjeta Gráfica", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            desktop.tarjetaGrafica = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Tamaño de Torre", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            desktop.torre = input;
                            validInput = true;
                        }
                    }
                    validInput = false;
                    while (!validInput) {
                        input = JOptionPane.showInputDialog(null, "Tamaño de Disco Duro", "Porfavor ingrese la información.", JOptionPane.INFORMATION_MESSAGE);
                        if (!input.isEmpty()) {
                            desktop.discoDuro = input;
                            validInput = true;
                        }
                    }
                    // Añade la desktop a la lista de desktop
                    desktops.add(desktop);
                }
            } else if (opcion == 1) {
                //VER EQUIPO-----------------------------------------------------------------

                opcion = JOptionPane.showOptionDialog(null, "¿Qué tipo de equipo quiere ver?", "Ver Equipo", 0, JOptionPane.QUESTION_MESSAGE, null, segundasOpciones, "");
                if (opcion == 0) {
                    //TABLETS
                    if (tablets.isEmpty()) {
                        // Muestra mensaje si no hay tablets registradas
                        JOptionPane.showMessageDialog(null, "No hay tablets registrados en el sistema.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Muestra información de cada tablet registrada
                        for (Tablet tablet : tablets) {
                            JOptionPane.showMessageDialog(null,
                                    "Fabricante: " + tablet.fabricante + "\n"
                                            + "Modelo: " + tablet.modelo + "\n"
                                            + "Microprocesador: " + tablet.microprocesador + "\n"
                                            + "Tamaño Diagonal de Pantalla: " + tablet.diagonalPantalla + "\n"
                                            + "¿Capacitiva/Resistiva? " + tablet.capacitivaResistiva + "\n"
                                            + "Tamaño Memoria NAND: " + tablet.memoriaNand + "\n"
                                            + "Sistema Operativo: " + tablet.sistemaOperativo + "\n", "Tablets", JOptionPane.INFORMATION_MESSAGE);
                        }

                    };
                } else if (opcion == 1) {
                    //LAPTOPS
                    if (laptops.isEmpty()) {
                        // Muestra mensaje si no hay laptops registradas
                        JOptionPane.showMessageDialog(null, "No hay laptops registrados en el sistema.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Muestra información de cada laptop registrada
                        for (Laptop laptop : laptops) {
                            JOptionPane.showMessageDialog(null,
                                    "Fabricante: " + laptop.fabricante + "\n"
                                            + "Modelo: " + laptop.modelo + "\n"
                                            + "Microprocesador: " + laptop.microprocesador + "\n"
                                            + "Memoria: " + laptop.memoria + "\n"
                                            + "Tamaño de Pantalla " + laptop.pantalla + "\n"
                                            + "Capacidad de Disco Duro: " + laptop.discoDuro + "\n", "Laptops", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                } else if (opcion == 2) {
                    //DESKTOPS
                    if (desktops.isEmpty()) {
                        // Muestra mensaje si no hay desktop registradas
                        JOptionPane.showMessageDialog(null, "No hay desktops registrados en el sistema.", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        // Muestra información de cada desktop registrada
                        for (Desktop desktop : desktops) {
                            JOptionPane.showMessageDialog(null,
                                    "Fabricante: " + desktop.fabricante + "\n"
                                            + "Modelo: " + desktop.modelo + "\n"
                                            + "Microprocesador: " + desktop.microprocesador + "\n"
                                            + "Memoria: " + desktop.memoria + "\n"
                                            + "Tarjeta Gráfica " + desktop.tarjetaGrafica + "\n"
                                            + "Tamaño de Torre: " + desktop.torre + "\n"
                                            + "Sistema Operativo: " + desktop.discoDuro + "\n", "Desktops", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        }
    }

}