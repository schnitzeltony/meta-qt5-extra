DESCRIPTION = "xdg-user-dirs is a tool to help manage user directories like the desktop folder and the music folder"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"
SRC_URI = "http://user-dirs.freedesktop.org/releases/${BPN}-${PV}.tar.gz"

inherit autotools gettext

do_install_append () {
	install -d ${D}${sysconfdir}/skel/.config/
	mv ${D}${sysconfdir}/xdg/user-dirs.defaults ${D}${sysconfdir}/skel/.config/user-dirs.dirs
}

SRC_URI[md5sum] = "f5aaf5686ad7d8809a664bfb4566a54d"
SRC_URI[sha256sum] = "20b4a751f41d0554bce3e0ce5e8d934be98cc62d48f0b90a894c3e1916552786"
