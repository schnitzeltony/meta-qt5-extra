require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native qtxmlpatterns"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5TextEditor, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5TextEditor, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir}/k*5"
FILES_${PN}-dbg += "${libdir}/plugins/kf5/parts/.debug"
