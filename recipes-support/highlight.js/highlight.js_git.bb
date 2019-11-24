SUMMARY = "Syntax highlighting with language autodetection"
HOMEPAGE = "https://highlightjs.org/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1536cfb4c71fcc69423296231a64c1c4"

inherit npm

SRC_URI = "git://github.com/highlightjs/highlight.js;protocol=https"
PV = "9.16.2"
SRCREV = "70f76a058d9740636dad13ec894d5825ca9b40fe"
S = "${WORKDIR}/git"

# devtool crashes currrently on lockdown creation
#NPM_LOCKDOWN := "${THISDIR}/${BPN}/package-lock.json"
NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"

do_install_append() {
   # TODO proper fix - all nodejs recipes share this problem attow
   chown -R root:root ${D}/${NPM_INSTALLDIR}
}
