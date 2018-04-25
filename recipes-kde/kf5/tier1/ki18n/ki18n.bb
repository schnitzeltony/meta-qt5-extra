require ${BPN}.inc 

inherit pythonnative

# revisit python?

DEPENDS += "${BPN}-native gettext-native qtscript qtdeclarative"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/kf5"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_PLUGINS}/kf5/.debug"

do_configure_append() {
    # align path to python for installed cmake-file
    sed -i 's:set(KI18N_PYTHON_EXECUTABLE.*:set(KI18N_PYTHON_EXECUTABLE "${bindir}/python"):g' ${B}/cmake/KF5I18NMacros.cmake
}
