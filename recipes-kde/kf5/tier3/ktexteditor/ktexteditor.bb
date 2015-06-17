require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native qtxmlpatterns"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5TextEditor, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5TextEditor, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/kf5/parts/.debug \
"
