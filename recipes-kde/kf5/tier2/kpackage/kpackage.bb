require ${BPN}.inc

inherit cmake-lib

DEPENDS += "${BPN}-native karchive ki18n kcoreaddons kconfig kdoctools"

CMAKE_ALIGN_SYSROOT[1] = "KF5Package, -s${_IMPORT_PREFIX}/bin, -S${STAGING_BINDIR_NATIVE}"

FILES_${PN} += "${datadir}/k*5"
