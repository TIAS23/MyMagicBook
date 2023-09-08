package com.bhavesh.tiashl.ui.clickListener

import com.bhavesh.tiashl.data.model.RoutineModel


interface OnTaskItemClicked {

    fun onEditClicked(routineModel: RoutineModel)

    fun onDeleteClicked(routineModel: RoutineModel)

    fun onTaskClick(routineModel: RoutineModel)
}