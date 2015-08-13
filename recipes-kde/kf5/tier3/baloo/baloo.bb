SUMMARY = "Baloo provides searching and indexing infrastucture with an emphasis on files"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-kf5 cmake-lib

DEPENDS += "ki18n kconfig kidletime kitemmodels kinit kauth kcrash solid kio kdelibs4support kfilemetadata ktexteditor xapian-core"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "2fb26fe7937565d3c8d54a11ee8b21a5"
SRC_URI[sha256sum] = "1ca97763c136d3b7762cdc04f6e76fb9d314ba38db8ad48778647590626e19e6"

SRC_URI += "file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5Baloo, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Baloo, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir} \
    ${libdir}/kauth \
    ${OE_QMAKE_PATH_QML}/org/kde/baloo \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
	${libdir}/*/.debug \
	${OE_QMAKE_PATH_QML}/org/kde/baloo/.debug \
	${OE_QMAKE_PATH_PLUGINS}/.debug \
	${OE_QMAKE_PATH_PLUGINS}/kf5/*/.debug \
"

