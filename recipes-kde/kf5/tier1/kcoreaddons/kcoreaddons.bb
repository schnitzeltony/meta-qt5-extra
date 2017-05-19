require ${BPN}.inc

inherit cmake_lib

DEPENDS += "${BPN}-native"

# native executables
CMAKE_ALIGN_SYSROOT[1] = "KF5CoreAddons, -s${_IMPORT_PREFIX}/bin, -s${KDE_PATH_EXTERNAL_HOST_BINS}"

PACKAGES =+ "${PN}-bin"

FILES_${PN} += "${datadir}/mime"
FILES_${PN}-bin = "${bindir}/desktoptojson"
