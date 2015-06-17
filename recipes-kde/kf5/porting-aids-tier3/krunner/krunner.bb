SUMMARY = "Framework for providing different actions given a string query"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
	file://src/abstractrunner.h;endline=18;md5=a6a49d7635ef149bcddf8c46f0eae999 \
"

inherit kde-kf5-porting-aids cmake-lib

DEPENDS += "qtdeclarative kconfig kcoreaddons ki18n kio kservice plasma-framework solid threadweaver"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "a59141c3aaa3e9f8f846082a9c1c78b9"
SRC_URI[sha256sum] = "83b3b6d77b953b6db397ced8636a8e0dbee780181cdaad07b80daaf778db6310"

CMAKE_ALIGN_SYSROOT[1] = "KF5Runner, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Runner, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/*/.debug"
