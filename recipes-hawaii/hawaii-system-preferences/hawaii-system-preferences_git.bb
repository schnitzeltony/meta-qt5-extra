SUMMARY = "System preferences for the Hawaii desktop environment"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit hawaii

DEPENDS += " \
    greenisland \
    libhawaii \
    polkit-qt-1 \
    kscreen \
"

SRCREV = "f1ce43687a0c9dcdbf0cd5640d38bbbc348dd123"
PV = "0.8.0"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DQt5LinguistTools_DIR=${STAGING_LIBDIR_NATIVE}/cmake/Qt5LinguistTools"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML} \
"

FILES_${PN}-dev += " \
    ${libdir}/cmake \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "HawaiiSystemPreferences, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "HawaiiSystemPreferences, -S${includedir}, -S${STAGING_INCDIR}"
