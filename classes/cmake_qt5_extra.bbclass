inherit cmake_qt5 cmake_extra_sanity

EXTRA_OECMAKE += " \
    -DCMAKE_QT5_EX_PATH_HOST_HEADERS=${STAGING_INCDIR} \
"

FILES_${PN}-dev += "${datadir}/cmake ${libdir}/cmake"
