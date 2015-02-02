SUMMARY = "Baloo provides searching and indexing infrastucture with an emphasis on files"
LICENSE = "GPLv2 LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde cmake-lib

DEPENDS += "ki18n kconfig kidletime kitemmodels kinit kauth kcrash solid kio kdelibs4support kfilemetadata ktexteditor xapian-core"

SRCREV = "e56b27a5e2078a989216eebcd9651fec3da967b6"
SRC_URI += "file://0001-fix-build-for-QT_NO_SESSIONMANAGER.patch"

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "KF5Baloo, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "KF5Baloo, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += "${datadir} \
	${libdir}/qml/org/kde/baloo \
	${libdir}/plugins ${libdir}/kauth \
"
FILES_${PN}-dbg += " \
	${libdir}/qml/org/kde/baloo/.debug \
	${libdir}/*/.debug \
	${libdir}/plugins/kf5/*/.debug \
"

