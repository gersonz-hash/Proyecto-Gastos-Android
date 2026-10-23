package edu.umg.programacion2.gastoscore

import edu.umg.programacion2.gastos.servicio.ControlGastos
import edu.umg.programacion2.gastos.datos.GastoRepositoryEnMemoria

object Dependencias {
    val control = ControlGastos(GastoRepositoryEnMemoria())
}