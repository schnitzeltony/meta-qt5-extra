require ${BPN}.inc 

inherit cmake-lib pythonnative

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5I18n, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5I18n, -S${includedir}, -S${STAGING_INCDIR}"
# revisit python?

DEPENDS += "${BPN}-native qtscript"

FILES_${PN} += "${libdir}/${QT_DIR_NAME}/plugins/kf5"
FILES_${PN}-dbg += "${libdir}/${QT_DIR_NAME}/plugins/kf5/.debug"
