require ${BPN}.inc

inherit cmake_lib

DEPENDS += "${BPN}-native gettext-native kdoctools-native karchive ki18n kcoreaddons kconfig kdoctools"

CMAKE_ALIGN_SYSROOT[1] = "KF5Package, -s${_IMPORT_PREFIX}/bin, -s${KDE_PATH_EXTERNAL_HOST_BINS}"

FILES_${PN} += "${datadir}/k*5"
