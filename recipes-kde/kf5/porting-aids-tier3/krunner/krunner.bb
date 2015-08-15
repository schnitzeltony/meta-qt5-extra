SUMMARY = "Framework for providing different actions given a string query"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://src/abstractrunner.h;endline=18;md5=a6a49d7635ef149bcddf8c46f0eae999"

inherit kde-kf5-porting-aids cmake-lib

DEPENDS += "qtdeclarative kconfig kcoreaddons ki18n kio kservice plasma-framework solid threadweaver"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "253f3fa45128074b0303b7fc72aebea4"
SRC_URI[sha256sum] = "8aa0b679c7780791a9f2075f1404af4924defec1f34dab6c2135796b2e3d49fa"

CMAKE_ALIGN_SYSROOT[1] = "KF5Runner, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Runner, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/*/.debug"
