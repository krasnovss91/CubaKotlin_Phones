package com.company.untitled72.web.screens.phone

import com.haulmont.cuba.gui.screen.*
import com.company.untitled72.entity.Phone

@UiController("untitled72_Phone.browse")
@UiDescriptor("phone-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
class PhoneBrowse : MasterDetailScreen<Phone>()