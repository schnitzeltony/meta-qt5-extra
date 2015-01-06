SUMMARY = "Mauii Plasma Simple Shell"
LICENSE = "GPLv2 | LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=4b54a1fd55a448865a0b32d41598759d \
"

inherit cmake_qt5 systemd pythonnative

DEPENDS = " \
	qtscript \
	plasma-framework \
	plasma-workspace \
	ki18n \
	kdelibs4support \
	krunner \
	kservice \
	solid \
	kitemmodels \
	kemoticons \
	kinit \
"

SRC_URI = "git://github.com/mauios/${BPN}.git;protocol=git;branch=master"
SRCREV = "9789d63a55e2ca74a70029574a6fe1a1dd94cbc2"

S = "${WORKDIR}/git"

# make it find qtwaylandscanner / install starter scripts in bindir
EXTRA_OECMAKE += " \
	-DCMAKE_PROGRAM_PATH=${STAGING_DIR_NATIVE}/$bindir/qt5 \
	-DCMAKE_INSTALL_LIBEXECDIR=${bindir} \
"

FILES_${PN} += " \
	${datadir} \
	${libdir}/qml \
"
FILES_${PN}-dbg += " \
	${libdir}/qml/*/*/*/*/.debug \
"

# starter scripts rely on bash qdbus catchsegv
RDEPENDS_${PN} = "bash qttools-tools qtwayland-plugins catchsegv"
