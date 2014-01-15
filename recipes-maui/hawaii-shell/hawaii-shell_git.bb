DESCRIPTION = "Hawaii desktop environment shell"
LICENSE = "LGPLv2 LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://COPYING.LIB;md5=4b54a1fd55a448865a0b32d41598759d \
"

inherit cmake_qt5

DEPENDS = "qtbase qtdeclarative qtwayland qtwayland-native fluid greenisland polkit-qt-1 qtconfiguration qtaccountsservice pixman weston"
RRECOMMENDS_${PN} += "hawaii-wallpapers"

SRC_URI = " \
	git://github.com/mauios/${BPN}.git;protocol=git;branch=stable \
	file://0001-GetGitRevision.cmake-call-git-directly-it-is-not-fou.patch \
	file://0002-client-CMakeLists.txt-avoid-dragging-in-host-libdir.patch \
	file://0003-compositor-CMakeLists.txt-avoid-dragging-in-host-lib.patch \
"
SRCREV = "efc18add78e292f9afb7167314b58286162281dc"
PV = "0.2.0.2+git${SRCPV}"

EXT-SRC-URI-libqtxdg = "git://github.com/plfiorini/libqtxdg.git"
EXT-SRCREV-libqtxdg = "b889f2b71cd79ef67cecd7e0415525ad959c50cd"

S = "${WORKDIR}/git"

# make it find qtwaylandscanner / use our libexdir
EXTRA_OECMAKE += " \
	-DCMAKE_PROGRAM_PATH=${STAGING_DIR_NATIVE}/$bindir/qt5 \
	-DCMAKE_INSTALL_LIBEXECDIR=${libexecdir} \
"

do_configure_prepend() {
	OLD_PATH=`pwd`
	# hack to extract git sub module manually
	cd ${S}/3rdparty
	rm -rf libqtxdg
	git clone ${EXT-SRC-URI-libqtxdg}
	cd libqtxdg
	git checkout ${EXT-SRCREV-libqtxdg}

	cd $OLD_PATH
}

FILES_${PN} += " \
	${datadir}/hawaii \
	${libdir}/hawaii \
	${libdir}/weston \
"
FILES_${PN}-dbg += " \
	${libdir}/hawaii/*/*/.debug \
	${libdir}/hawaii/*/*/*/.debug \
	${libdir}/hawaii/*/*/*/*/.debug \
	${libdir}/weston/.debug \
"
