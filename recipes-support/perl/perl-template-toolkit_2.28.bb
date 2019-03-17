SUMMARY = "Template processing system"
HOMEPAGE = "http://www.template-toolkit.org/"

LICENSE = "Artisticv1 | GPLv1+"
LIC_FILES_CHKSUM = " \
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d \
" 

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AT/ATOOMIC/Template-Toolkit-${PV}.tar.gz"
SRC_URI[md5sum] = "64d0bb7fc74bcc56164d7418144b52f8"
SRC_URI[sha256sum] = "71af368009f13582ef907e33d3812776b597f42b3da0bc0fd3bc7418e4785dd7"

S = "${WORKDIR}/Template-Toolkit-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
