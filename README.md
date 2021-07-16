OE layer to desktop environments based on Qt5
---------------------------------------------


Layer dependencies:
----------------------
see [layer.conf](conf/layer.conf) for dependencies and [Layer-index](https://layers.openembedded.org/layerindex/branch/master/layers/) where to find layers


Contributing
------------
* Submit any patches against the `meta-qt5-extra` layer by using the GitHub pull-request feature.


Policies
--------
* **Please do not send private emails to maintainer - they will not be answered anymore**. For bug-reports/questions/suggestions.. use [issues](https://github.com/schnitzeltony/meta-qt5-extra/issues).
* Pull requests should follow [OE-Styleguide](https://www.openembedded.org/wiki/Styleguide) with the following additions:
  * Use 4 spaces for indentation always (shell and python code)
  * For splitting of long list values use four-space indentation on sucessive lines and prefer the closing quote as the first character ([OE-Styleguide](https://www.openembedded.org/wiki/Styleguide) - second example)
  * Pull-requests with patches fixing issues for musl, clang or gold-linker are accepted only if patches have upstream-status "Applied" or "Backport" and contain a link to the upstream patch.
* Be aware that **this layer changes other layer's defaults by bbappends**. Maintainer disagrees with common 'configure to death practice' and won't waste time explaining dozens of knobs that are mandatory to get working/useful builds. See
  [extends-meta-oe](extends-meta-oe) / [extends-meta-qt5](extends-meta-qt5) / [extends-oe-core](extends-oe-core).
  Pull requests removing appends for sake of magic 'compliant' scripts  are not accepted.


Maintainers
-----------

Layer maintainer: Andreas Müller <schnitzeltony@gmail.com>
